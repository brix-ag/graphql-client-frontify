package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CatalogRowUsage {
  /**
   * **BETA** The in-use `CatalogRow`.
   */
  @com.google.gson.annotations.SerializedName("row")
  private ch.brix.gql.client.frontify.objects.CatalogRow row;
  /**
   * **BETA** Why this `CatalogRow` is currently in use.
   */
  @com.google.gson.annotations.SerializedName("reasons")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.enums.CatalogRowUsageReason.class)
  private java.util.List<ch.brix.gql.client.frontify.enums.CatalogRowUsageReason> reasons;
}
