package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UserGroup implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `UserGroup` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `UserGroup` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `UserGroup`'s `UserItems`.
   */
  @com.google.gson.annotations.SerializedName("users")
  private ch.brix.gql.client.frontify.objects.UserItems users;
}
