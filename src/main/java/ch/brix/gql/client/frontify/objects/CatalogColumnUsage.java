package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogColumnUsage {
  /**
   * **BETA** The in-use `CatalogColumn`.
   */
  @com.google.gson.annotations.SerializedName("column")
  private ch.brix.gql.client.frontify.interfaces.CatalogColumn column;
  /**
   * **BETA** Why this `CatalogColumn` is currently in use.
   */
  @com.google.gson.annotations.SerializedName("reasons")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.enums.CatalogColumnUsageReason.class)
  private java.util.List<ch.brix.gql.client.frontify.enums.CatalogColumnUsageReason> reasons;
}
