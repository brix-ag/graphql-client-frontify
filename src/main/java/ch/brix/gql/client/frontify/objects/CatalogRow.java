package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogRow implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * **BETA** `CatalogRow` ID.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** `position` of the `CatalogRow` for ordering.
   */
  @com.google.gson.annotations.SerializedName("position")
  private ch.brix.gql.client.frontify.scalars.IntScalar position;
  /**
   * **BETA** `Catalog` of the `CatalogRow`.
   */
  @com.google.gson.annotations.SerializedName("catalog")
  private ch.brix.gql.client.frontify.objects.Catalog catalog;
  /**
   * **BETA** `cells` of the `CatalogRow`.
   */
  @com.google.gson.annotations.SerializedName("cells")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CatalogCell.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell> cells;
}
