package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateCatalog {
  /**
   * **BETA** The `Catalog` that was just created.
   */
  @com.google.gson.annotations.SerializedName("catalog")
  private ch.brix.gql.client.frontify.objects.Catalog catalog;
}
