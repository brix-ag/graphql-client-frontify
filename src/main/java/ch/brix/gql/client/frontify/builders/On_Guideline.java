package ch.brix.gql.client.frontify.builders;

public class On_Guideline extends ch.brix.gql.client.TypeBuilder {
  public On_Guideline() {
    super(new ch.brix.gql.client.On("Guideline"));
  }
  /**
   * `Guideline` Id.
   */
  public On_Guideline id() {
    _add_field("id");
    return this;
  }
  /**
   * `Guideline` name.
   */
  public On_Guideline name() {
    _add_field("name");
    return this;
  }
  /**
   * `Guideline` color.
   */
  public On_Guideline color(Guideline_color callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Guideline` internal url.
   */
  public On_Guideline url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA** The default language of the `Guideline`, or `null` if not set.
   */
  public On_Guideline defaultLanguage(Guideline_defaultLanguage callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** Languages in which the `Guideline` is available.
   */
  public On_Guideline translationLanguages(Guideline_translationLanguages callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Paginated list of `LibraryPage` items for `Guideline`.
   */
  public On_Guideline libraryPages(Guideline_libraryPages callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** A list of `GuidelinePage`s that belong to this `Guideline`
   */
  public On_Guideline pages(Guideline_pages callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
