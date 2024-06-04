package com.beboop.evildoggy

import com.beboop.evildoggy.classes.Badangler
import com.beboop.evildoggy.classes.Bidoofer
import com.beboop.evildoggy.classes.Roles
import com.beboop.evildoggy.classes.Werewolf
import java.util.Random

class Game {
    private var roles: MutableList<Roles>

    init {
        roles = mutableListOf<Roles>(Werewolf(), Bidoofer(), Badangler())
    }

    fun randomRoleIdx() : Int {
        return (0..(roles.size-1)).random()
    }

    fun getRoles() : List<Roles> {
        return roles
    }
}