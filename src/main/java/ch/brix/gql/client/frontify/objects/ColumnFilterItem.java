package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ColumnFilterItem {
  /**
   * **BETA** The cell value.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
  /**
   * **BETA** Number of occurrences of this value.
   */
  @com.google.gson.annotations.SerializedName("count")
  private ch.brix.gql.client.frontify.scalars.IntScalar count;
}
