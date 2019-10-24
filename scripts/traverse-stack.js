'use strict'

class Traverse {

    static next(stack) {
        let value = stack.pop()
        if (!value) {
            return null
        }
        let next = Traverse.next(stack)
        return next ? value + next : value
    }

}

const run = () => {
    let stack = ['1', '2', '3', '4', '5']
    console.log(Traverse.next(stack))
}

run()