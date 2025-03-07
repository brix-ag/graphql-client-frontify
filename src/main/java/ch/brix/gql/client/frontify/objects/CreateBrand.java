package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateBrand {
  /**
   * The newly created `Brand`.
   */
  @com.google.gson.annotations.SerializedName("brand")
  private ch.brix.gql.client.frontify.objects.Brand brand;
}
