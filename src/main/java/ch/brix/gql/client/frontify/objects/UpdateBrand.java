package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateBrand {
  /**
   * The updated `Brand`.
   */
  @com.google.gson.annotations.SerializedName("brand")
  private ch.brix.gql.client.frontify.objects.Brand brand;
}
