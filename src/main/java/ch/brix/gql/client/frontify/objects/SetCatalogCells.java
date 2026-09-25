package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class SetCatalogCells {
  /**
   * **BETA** The `cells` that were just set in the `Catalog`.
   */
  @com.google.gson.annotations.SerializedName("cells")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CatalogCell.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell> cells;
}
