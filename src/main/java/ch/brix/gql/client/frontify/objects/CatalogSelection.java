package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogSelection {
  /**
   * **BETA** `CatalogSelection` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** Root-level entries of the selection tree.
   */
  @com.google.gson.annotations.SerializedName("entries")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CatalogSelectionEntry.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CatalogSelectionEntry> entries;
}
