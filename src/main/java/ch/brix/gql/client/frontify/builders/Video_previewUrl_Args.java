package ch.brix.gql.client.frontify.builders;

public class Video_previewUrl_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Video` preview width value in pixels.
   * Default value: null
   */
  public Video_previewUrl_Args width(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("width", value);
    return this;
  }
  /**
   * `Video` preview height value in pixels.
   * Default value: null
   */
  public Video_previewUrl_Args height(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("height", value);
    return this;
  }
}
