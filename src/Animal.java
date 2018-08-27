class Animal {
    private String name;

    Animal(String _name) {
        if (_name == null || _name.isEmpty())
            throw new java.lang.RuntimeException("Empty animal's name");

        name = _name;
    }

    String getName() {
        return this.name;
    }
}
