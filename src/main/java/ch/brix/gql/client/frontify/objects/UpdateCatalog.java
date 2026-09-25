package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateCatalog {
  /**
   * **BETA** The updated `Catalog`.
   */
  @com.google.gson.annotations.SerializedName("catalog")
  private ch.brix.gql.client.frontify.objects.Catalog catalog;
}
