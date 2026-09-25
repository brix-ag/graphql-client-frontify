package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ColumnFilter {
  /**
   * **BETA** The column ID.
   */
  @com.google.gson.annotations.SerializedName("columnId")
  private ch.brix.gql.client.frontify.scalars.IdScalar columnId;
  /**
   * **BETA** The column name.
   */
  @com.google.gson.annotations.SerializedName("columnName")
  private ch.brix.gql.client.frontify.scalars.StringScalar columnName;
  /**
   * **BETA** Paginated filter values with counts.
   */
  @com.google.gson.annotations.SerializedName("items")
  private ch.brix.gql.client.frontify.objects.ColumnFilterItems items;
}
