package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ServiceApp {
  /**
   * **BETA** The ID of the ServiceApp
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The description text of the ServiceApp
   */
  @com.google.gson.annotations.SerializedName("description")
  private ch.brix.gql.client.frontify.scalars.StringScalar description;
  /**
   * **BETA** Describes if the ServiceApp is enabled or disabled
   */
  @com.google.gson.annotations.SerializedName("status")
  private ch.brix.gql.client.frontify.enums.ServiceAppStatus status;
  /**
   * **BETA** The scopes that are accessible to the ServiceApp
   */
  @com.google.gson.annotations.SerializedName("scopes")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.enums.SecurityScope.class)
  private java.util.List<ch.brix.gql.client.frontify.enums.SecurityScope> scopes;
  /**
   * **BETA** The title of the ServiceAPpp
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
