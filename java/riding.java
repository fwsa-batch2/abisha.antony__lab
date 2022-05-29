
    class sports {
        String getname() {

            return "Generic Sports";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has n players in " + getname());
        }
    }

    class Soccer extends sports  {
        @Override
        String getname() {
            return "Soccer class";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 players in " + getname());
        }
    }

        public class riding {

            public static void main(String[] args) {
                sports ob = new sports();
                Soccer obj = new Soccer();
                System.out.println(ob.getname());
                ob.getNumberOfTeamMembers();
                System.out.println(obj.getname());
                obj.getNumberOfTeamMembers();

            }

        }



