'use strict'

const run = () => {
    let text = ''

    let until = 10
    let start = 0

    while(start < until) {
        text += start
        start ++
    }

    if (text.length > 9) {
        console.log(text)
    }
    
    text = text.split('').reverse().join('')
    console.log(text)

}

run()