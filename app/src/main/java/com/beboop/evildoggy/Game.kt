package com.beboop.evildoggy

import com.beboop.evildoggy.classes.Badangler
import com.beboop.evildoggy.classes.Bidoofer
import com.beboop.evildoggy.classes.Roles
import com.beboop.evildoggy.classes.Werewolf

class Game {
    private var roles: MutableList<Roles>

    init {
        roles = mutableListOf<Roles>(Werewolf(), Bidoofer(), Badangler())
        roles.shuffle()
    }

    fun getRoles() : List<Roles> {
        return roles
    }
}