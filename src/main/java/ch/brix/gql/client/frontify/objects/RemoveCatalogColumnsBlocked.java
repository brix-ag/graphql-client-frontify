package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RemoveCatalogColumnsBlocked {
  /**
   * **BETA** The in-use `CatalogColumn`s that prevented the removal, with the reasons each is in use.
   */
  @com.google.gson.annotations.SerializedName("blockedColumns")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CatalogColumnUsage.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CatalogColumnUsage> blockedColumns;
}
