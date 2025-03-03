public int castSpells(Spell s1, Spell s2) {
    if (s1 instanceof Water && s2 instanceof Fire) {
        return -1;
    } else if (s2 instanceof Water && s1 instanceof Fire) {
        return 1;
    }

    if (s1.getIntensity() < s2.getIntensity()) {
        return 1;
    } else if (s1.getIntensity() > s2.getIntensity()) {
        return -1;
    } else {
        return 0;
    }
}
