'use strict'

const run = () => {
    // In Javascript a string is zero or more charaters written inside single or double quotes
    // strings can be declared using single or double quotes
    let string1 = 'this is my string'
    let string2 = "this is another string"

    // it is possible to check string length using the length property
    console.log('my string is this many characters long:', string1.length)

    // it is possible to combine strings using plus sign
    let myCombinedString = string1 + '\n' + string2
    console.log('my combined string', myCombinedString)
}


run()