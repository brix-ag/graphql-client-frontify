package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateServiceApp {
  /**
   * **BETA** The created ServiceApp
   */
  @com.google.gson.annotations.SerializedName("serviceApp")
  private ch.brix.gql.client.frontify.objects.ServiceApp serviceApp;
  /**
   * **BETA** The secret tied to the ServiceApp
   */
  @com.google.gson.annotations.SerializedName("secret")
  private ch.brix.gql.client.frontify.scalars.StringScalar secret;
  /**
   * **BETA** Disclaimer message
   */
  @com.google.gson.annotations.SerializedName("message")
  private ch.brix.gql.client.frontify.scalars.StringScalar message;
}
