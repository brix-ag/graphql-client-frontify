package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DuplicateCatalogRow {
  /**
   * **BETA** The `CatalogRow` that was just duplicated.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
}
