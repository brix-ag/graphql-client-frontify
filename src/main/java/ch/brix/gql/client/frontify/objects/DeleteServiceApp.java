package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteServiceApp {
  /**
   * **BETA** The ID of the removed ServiceApp
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
