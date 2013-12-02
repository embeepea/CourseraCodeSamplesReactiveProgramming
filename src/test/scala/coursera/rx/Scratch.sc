package coursera.rx

import rx.lang.scala.{Observable, Subscription, Observer}
import scala.language.postfixOps
import scala.concurrent.duration._
import org.junit.Test
import org.scalatest.junit.JUnitSuite
import rx.lang.scala.subscriptions.CompositeSubscription
import rx.lang.scala.subjects.PublishSubject
import scala.async._
import scala.async.Async._

import scala.util.{ Try, Success, Failure }
import rx.lang.scala.Notification._


object Scratch {
    println("Starting up da worksheet!")          //> Starting up da worksheet!
    
    val o = Observable.interval(9 seconds)        //> o  : rx.lang.scala.Observable[Long] = rx.lang.scala.Observable$$anon$9@1f8a3
                                                  //| 8e
    o.subscribe(printf("Got a value: %1d\n", _))  //> res0: rx.lang.scala.Subscription = rx.lang.scala.Subscription$$anon$1@e76514
                                                  //| 
    println("sleeping")                           //> sleeping
    Thread.sleep(10000)                           //> Got a value: 0
    println("done")                               //> done

/*
    val o : Observable[Int] = Observable[Int] { obs : Observer[Int] => {
            Thread.sleep(3000)
            obs.onNext(42)
            obs.onCompleted()
            Subscription {}
        }
    }
    o.subscribe(println(_))
    Thread.sleep(5000)
    println("all done now!")
*/



/*
    val channel = PublishSubject[Int]()
    
    val obs = channel.materialize filter {
      case OnCompleted() => false
      case _ => true
    } map {
      case OnNext(e) => Success(e)
      case OnError(t) => Failure(t)
      //case OnCompleted() => ()
    }
    
    
    val a = obs.subscribe( x => println("a: "+x),
                               e => println("a error: " + e.getMessage),
                               () => println("a: onCompleted") )
                               
    channel.onNext(42)
    channel.onNext(43)
    //channel.onError(new Exception("my error"))
    channel.onNext(44)
    channel.onCompleted()
    a.unsubscribe()
*/

/*
    val o = Observable("foo", "mark phillips", "andrea kirsten fey")
    val os = o.map { s => s.replace(' ', '_') }
    val s = os.subscribe {
      x => println(x)
    }
    Thread sleep 3
    s.unsubscribe
*/
   

/*
    val channel = PublishSubject[Int]()
    
    val a = channel.subscribe( x => println("a: "+x),
                               e => println("a error: " + e.getMessage),
                               () => println("a: onCompleted") )
                               
    val b = channel.subscribe( x => println("b: "+x),
                               e => println("b error: " + e.getMessage),
                               () => println("b: onCompleted") )
    
    channel.onNext(42)
    a.unsubscribe()
    channel.onNext(4711)
    channel.onCompleted()
    val c = channel.subscribe(x => println("c: "+x),
                               e => println("c error: " + e.getMessage),
                               () => println("c: onCompleted"))
    channel.onNext(13)
*/


/*
    val e = EarthQuakes.groupedByCountry
     
    
    val subs = rx.lang.scala.subscriptions.CompositeSubscription()

    val o = e
*/

/*
    val subscription: Subscription     = o.subscribe { x => x match {
      case (country,obs) =>
        printf("Getting Earthquakes in %s now\n", country)
        subs += obs.subscribe { x => x match {
            case (feature,cty) => {
               println("  => " + country + ": " + feature.properties.place)
            }
          }
        }
      }
    }
    subs += subscription

    Thread sleep 5000

    // stop the stream
    
    //subscription.unsubscribe()
    subs.unsubscribe()
*/
    
    
//    println("That's all folks!")

}