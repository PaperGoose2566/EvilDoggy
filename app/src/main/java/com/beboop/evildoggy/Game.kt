package com.beboop.evildoggy

import com.beboop.evildoggy.classes.Badangler
import com.beboop.evildoggy.classes.Bidoofer
import com.beboop.evildoggy.classes.Roles
import com.beboop.evildoggy.classes.Werewolf
import java.util.Random

class Game {
    // list of active roles
    private var roles: MutableList<Roles>

    init {
        // initial set of roles, can later be changed for game modes idk I'm underpaid
        roles = mutableListOf<Roles>(Werewolf(), Bidoofer(), Badangler())
    }

    fun randomRoleIdx() : Int {
        // get a random index within role so that the main activity looks fancier
        return (0..(roles.size-1)).random()
    }

    fun getRoles() : List<Roles> {
        return roles
    }
}