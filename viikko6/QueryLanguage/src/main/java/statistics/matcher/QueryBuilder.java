/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

/**
 *
 * @author T460
 */
public class QueryBuilder {
    Matcher matcher;

    public QueryBuilder() {
        this.matcher = new All();
    }

    public QueryBuilder(Matcher m) {
        this.matcher = m;
    }

    public Matcher build() {
        return matcher;
    }

    public QueryBuilder playsIn(String team) {
        // this.matcher = new And(matcher, new PlaysIn(team));
        return new QueryBuilder(new And(matcher, new PlaysIn(team)));
    }

    public QueryBuilder hasAtLeast(int number, String unit) {
       
        return new QueryBuilder(new And(matcher, new HasAtLeast(number, unit)));
    }

    public QueryBuilder hasFewerThan(int number, String unit) {
        
        return new QueryBuilder(new And(matcher, new HasFewerThan(number, unit)));
    }

    public QueryBuilder oneOf(Matcher... matchers) {
        
        
        return new QueryBuilder(new Or(matchers));
    }
    
}
