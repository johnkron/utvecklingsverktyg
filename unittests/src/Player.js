'use strict'

module.exports = class Player {

    constructor() {
        this._state  = 'stopped'
    }

    get state() {
        return this._state
    }

    play() {
        this._state = 'playing'
    }

    stop() {
        this._state = 'stopped'
    }

    pause() {
        if (this._state !== 'playing') {
            throw new Error('Player has to be in playing state to do pause"')
        }
        this._state = 'paused'
    }

}