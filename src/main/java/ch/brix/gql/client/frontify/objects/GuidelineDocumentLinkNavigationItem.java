package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelineDocumentLinkNavigationItem {
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.StringScalar url;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("openNewTab")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar openNewTab;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("displayMode")
  private ch.brix.gql.client.frontify.enums.GuidelineDocumentLinkDisplayMode displayMode;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("iconPosition")
  private ch.brix.gql.client.frontify.enums.GuidelineDocumentLinkIconPosition iconPosition;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("iconAssetId")
  private ch.brix.gql.client.frontify.scalars.IdScalar iconAssetId;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("iconFileId")
  private ch.brix.gql.client.frontify.scalars.StringScalar iconFileId;
}
