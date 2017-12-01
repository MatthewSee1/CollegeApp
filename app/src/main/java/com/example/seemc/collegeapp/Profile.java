package com.example.seemc.collegeapp;

/**
 * Created by SeeMC on 11/27/2017.
 */

public class Profile {
    String firstName;
    String lastName;



    public Profile(){
        this.firstName = "Alan";
        this.lastName = "Turing";


        public Profile(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }
            public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        }



