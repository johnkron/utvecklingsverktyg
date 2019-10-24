'use strict'

const Promise = require('bluebird')

const puppeteer = require('puppeteer')

const run = async () => {
  const browser = await puppeteer.launch()
  const page = await browser.newPage()

  await page.goto('https://yle.fi/uutiset', { waitUntil: 'networkidle0' })
  let result = await page.evaluate(() => {
    return $('.yle__article__listItem__link')
        .toArray()
        .map((el) => {
            return {
                link: window.location.origin + $(el).attr('href'),
                title: $(el).find('h1').text()
            }
        })
  })

  console.log(result)

  await browser.close()
}

Promise.resolve(run()).catch(console.error).finally(process.exit)