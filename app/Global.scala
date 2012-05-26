import play.api._
import play.api.mvc._
import play.api.data._
import akka.actor.Actor
import akka.actor.Props
import akka.util.duration.intToDurationInt
import play.api.libs.concurrent.Akka

object Global extends GlobalSettings {
  override def onStart(app: Application) {
  	Logger.debug("Starting application")
  	Akka.system(app).scheduler.schedule(2 seconds, 10 seconds) {
	  Logger.debug("Heartbeat")
	}
  }
  
}