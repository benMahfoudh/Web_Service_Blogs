/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

/**
 *
 * @author Mehdi
 */
public enum Status {
    Published(0), 
    ReportAsAbused(1),
    WaitForValidation(2);
    Status(int val) {
        this.val = val;
    }
    int val;
}
