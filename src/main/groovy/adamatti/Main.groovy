package adamatti

import com.elepy.Elepy
import com.elepy.admin.AdminPanel
import com.elepy.mongo.MongoConfiguration

class Main {
    static void main(String [] args){
        new Elepy()
            .addConfiguration(AdminPanel.newAdminPanel())
            .addConfiguration(MongoConfiguration.inMemory())
            .onPort(7777)
            .addModels(Product.class, Country.class, State.class)
            .start()
    }
}
