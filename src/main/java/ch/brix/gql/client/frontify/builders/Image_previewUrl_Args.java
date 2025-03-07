package ch.brix.gql.client.frontify.builders;

public class Image_previewUrl_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Image` preview width value in pixels.
   * Default value: null
   */
  public Image_previewUrl_Args width(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("width", value);
    return this;
  }
  /**
   * `Image` preview height value in pixels.
   * Default value: null
   */
  public Image_previewUrl_Args height(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("height", value);
    return this;
  }
}
