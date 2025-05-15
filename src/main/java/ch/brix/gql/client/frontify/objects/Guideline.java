package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Guideline implements ch.brix.gql.client.frontify.interfaces.Node {
  /**
   * `Guideline` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * `Guideline` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `Guideline` color.
   */
  @com.google.gson.annotations.SerializedName("color")
  private ch.brix.gql.client.frontify.objects.RgbaColor color;
  /**
   * `Guideline` internal url.
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.UrlScalar url;
  /**
   * **BETA** The default language of the `Guideline`, or `null` if not set.
   */
  @com.google.gson.annotations.SerializedName("defaultLanguage")
  private ch.brix.gql.client.frontify.objects.Language defaultLanguage;
  /**
   * **BETA** Languages in which the `Guideline` is available.
   */
  @com.google.gson.annotations.SerializedName("translationLanguages")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.Language.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.Language> translationLanguages;
  /**
   * Paginated list of `LibraryPage` items for `Guideline`.
   */
  @com.google.gson.annotations.SerializedName("libraryPages")
  private ch.brix.gql.client.frontify.objects.LibraryPageItems libraryPages;
  /**
   * **BETA** A list of `GuidelinePage`s that belong to this `Guideline`
   */
  @com.google.gson.annotations.SerializedName("pages")
  private ch.brix.gql.client.frontify.objects.GuidelinePageItems pages;
}
