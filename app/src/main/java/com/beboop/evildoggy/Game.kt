package com.beboop.evildoggy

import com.beboop.evildoggy.classes.Badangler
import com.beboop.evildoggy.classes.Bidoofer
import com.beboop.evildoggy.classes.Roles
import com.beboop.evildoggy.classes.Werewolf

class Game {
    private var roles = listOf<Roles>(Werewolf(), Bidoofer(), Badangler())

    init {
        roles = roles.shuffled()
    }

    fun printRoles() : List<Roles> {
        return roles
    }
}