package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogSelectionEntry {
  /**
   * **BETA** `CatalogSelectionEntry` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** Opaque id of the link column that led to this entry, `null` for root entries.
   */
  @com.google.gson.annotations.SerializedName("sourceColumnId")
  private ch.brix.gql.client.frontify.scalars.IdScalar sourceColumnId;
  /**
   * **BETA** The selected `CatalogRow`.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
  /**
   * **BETA** Linked-row children of this entry.
   */
  @com.google.gson.annotations.SerializedName("children")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CatalogSelectionEntry.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CatalogSelectionEntry> children;
}
