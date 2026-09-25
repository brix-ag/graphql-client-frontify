package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RemoveCatalogRowsBlocked {
  /**
   * **BETA** The in-use `CatalogRow`s that prevented the removal, with the reasons each is in use.
   */
  @com.google.gson.annotations.SerializedName("blockedRows")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CatalogRowUsage.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CatalogRowUsage> blockedRows;
}
