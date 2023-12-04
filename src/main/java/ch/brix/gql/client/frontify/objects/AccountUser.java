package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AccountUser implements ch.brix.gql.client.frontify.interfaces.Node, ch.brix.gql.client.frontify.interfaces.User {
  /**
   * `AccountUser` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `AccountUser` email.
   */
  @com.google.gson.annotations.SerializedName("email")
  private ch.brix.gql.client.frontify.scalars.EmailScalar email;
  /**
   * `AccountUser` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `AccountUser` avatar.
   */
  @com.google.gson.annotations.SerializedName("avatar")
  private ch.brix.gql.client.frontify.scalars.UrlScalar avatar;
}
