'use strict'

const assert = require('assert')
const Player = require('../Player')

describe('Player unit tests', () => {
    it('should change state when playing', () => {
        let player = new Player()
        player.play()

        assert.equal(player.state, 'playing')
    })
})