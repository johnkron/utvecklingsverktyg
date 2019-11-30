'use strict'

const run = () => {
    // create an array
    // in Javascript arrays can contain any type of variable. String, Number, Object or even Array
    let myArray = ['weener1', 1, {}, []]

    // Access index into an array item
    let first = myArray[0]
    console.log('first', first)
    let second = myArray[1]
    console.log('second', second)

    // check array length, will print out 4
    console.log('array length', myArray.length)

    // simplest way to loop over an array is to use forEach
    myArray.forEach((item, index) => {
        // array item
        console.log('array item number ' + index, item)
    })

    // add a new item to the end of the array
    myArray.push('new last item')
    console.log('now the array contains one more item', myArray)

    // to remove from the end of the array use pop
    myArray.pop()
    console.log('new the newly added item is removed', myArray)

    // to find the index of an item use indexOf
    let indexOfNumber1 = myArray.indexOf(1)
    console.log('number 1 should be at index ', indexOfNumber1)

}

run()