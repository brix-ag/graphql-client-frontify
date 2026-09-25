package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataCatalogEntry {
  /**
   * **BETA** Cells readable for displaying this selected catalog entry.
   */
  @com.google.gson.annotations.SerializedName("cells")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogCell.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.CustomMetadataCatalogCell> cells;
  /**
   * **BETA** Opaque catalog selection entry ID.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
