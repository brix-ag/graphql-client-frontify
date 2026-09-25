package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddLibraryAssetTargets {
  /**
   * **BETA** The assets affected by the mutation.
   */
  @com.google.gson.annotations.SerializedName("assets")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.Asset.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.Asset> assets;
}
