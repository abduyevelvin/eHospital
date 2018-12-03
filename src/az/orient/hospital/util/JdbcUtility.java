/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package az.orient.hospital.util;

import java.sql.*;

/**
 *
 * @author EAAbduyev
 */
public class JdbcUtility {
    
    public static void close(Connection c, PreparedStatement ps, ResultSet rs) throws Exception {
        if(c != null)
            c.close();
        if(ps != null)
            ps.close();
        if(rs != null)
            rs.close();
    }
    
}
