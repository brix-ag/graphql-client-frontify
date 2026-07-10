package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Account implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `Account` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * List and search `UserItems`.
   */
  @com.google.gson.annotations.SerializedName("users")
  private ch.brix.gql.client.frontify.objects.UserItems users;
  /**
   * List and search `UserGroupItems`.
   */
  @com.google.gson.annotations.SerializedName("userGroups")
  private ch.brix.gql.client.frontify.objects.UserGroupItems userGroups;
}
