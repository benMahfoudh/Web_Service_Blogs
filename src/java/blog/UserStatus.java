/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

/**
 *
 * @author Mehdi
 */
public enum UserStatus {
    ENABLE(0),
    DISABLED(1);
    UserStatus(int val){
        this.val = val;
    }
    int val;
}
