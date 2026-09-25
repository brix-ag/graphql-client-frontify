package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MoveCatalogRow {
  /**
   * **BETA** The `CatalogRow` that was just moved.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
}
