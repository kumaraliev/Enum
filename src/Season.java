public enum Season {
    WINTER("Kysh"){
        @Override
        public void met() {
            System.out.println("Suuk");
        }
    },
    SPRING("Jaz"){
        @Override
        public void met() {
            System.out.println("Jiluu");
        }
    },
    SUMMER("Jai"){
        @Override
        public void met() {
            System.out.println("Issik");
        }
    },
    AUTUMN("kYZ"){
        @Override
        public void met() {
            System.out.println("Salkin");
        }
    };

    private String name;



    Season(String name) {
        this.name = name;

    }


    public void method(){
        System.out.println("Jil Mezgil");
    }
    public abstract void met();

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
