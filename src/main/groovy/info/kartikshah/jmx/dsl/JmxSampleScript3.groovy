package info.kartikshah.jmx.dsl

/**
 * Created by IntelliJ IDEA.
 * User: Kartik.Shah
 * Date: Feb 15, 2010
 * Time: 10:56:56 PM
 * To change this template use File | Settings | File Templates.
 */
jmx {
    server "service:jmx:rmi://sdlcoriljbsi01.suddenlink.cequel3.com/jndi/rmi://sdlcoriljbsi01.suddenlink.cequel3.com:1090/jmxconnector" {
      username="admin"
      password="admin"
      query "jboss.web:*" {
        findAll "j2eeType=WebModule" {
          chart{
            chartType="Bar"
            attributes={m-> [m.processingTime, m.path]}
            labels=["Time per Webapp", "Webapp", "Time"]
            options=[false, true, true]
            windowTitle="JBoss Module Processing Time"
            width=1200
            height=700
            refreshRate=5000
            show()
          }
        }
      }
    }
  }