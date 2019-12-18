package jp.or.presto.pjgriddemo.table;

import java.util.UUID;
import com.microsoft.azure.storage.table.TableServiceEntity;

public class CustomerEntity extends TableServiceEntity {

    // Note: An entity's partition and row key uniquely identify the entity in
    // the table.
    // Entities with the same partition key can be queried faster than those
    // with different partition keys.
    public CustomerEntity(String lastName, String firstName) {
        this.partitionKey = lastName;
        this.rowKey = firstName;
    }

    public CustomerEntity() {
    }

    public String Email;
    public String PhoneNumber;
    public UUID Id;

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public UUID getId() {
        return this.Id;
    }

    public void setId(UUID id) {
        this.Id = id;
    }
}