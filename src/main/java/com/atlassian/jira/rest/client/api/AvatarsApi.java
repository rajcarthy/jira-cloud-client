package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.Avatar;
import com.atlassian.jira.rest.client.model.Avatars;
import com.atlassian.jira.rest.client.model.SystemAvatars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.AvatarsApi")
public class AvatarsApi {
    private ApiClient apiClient;

    public AvatarsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AvatarsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete avatar
     * Deletes an avatar from a project or issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>403</b> - Returned if the user does not have permission to delete the avatar, the avatar is not deletable.
     * <p><b>404</b> - Returned if the avatar type, associated item ID, or avatar ID is invalid.
     * @param type The avatar type.
     * @param owningObjectId The ID of the item the avatar is associated with.
     * @param id The ID of the avatar.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteAvatar(String type, String owningObjectId, Long id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling deleteAvatar");
        }
        // verify the required parameter 'owningObjectId' is set
        if (owningObjectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'owningObjectId' when calling deleteAvatar");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteAvatar");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("type", type);
        uriVariables.put("owningObjectId", owningObjectId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/universal_avatar/type/{type}/owner/{owningObjectId}/avatar/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get system avatars by type
     * Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>500</b> - Returned if an error occurs while retrieving the list of avatars.
     * @param type The avatar type.
     * @return SystemAvatars
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SystemAvatars getAllSystemAvatars(String type) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling getAllSystemAvatars");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/avatar/{type}/system").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<SystemAvatars> returnType = new ParameterizedTypeReference<SystemAvatars>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get avatars
     * Returns the system and custom avatars for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the avatar type is invalid, the associated item ID is missing, or the item is not found.
     * @param type The avatar type.
     * @param entityId The ID of the item the avatar is associated with.
     * @return Avatars
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Avatars getAvatars(String type, String entityId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling getAvatars");
        }
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityId' when calling getAvatars");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("type", type);
        uriVariables.put("entityId", entityId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/universal_avatar/type/{type}/owner/{entityId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Avatars> returnType = new ParameterizedTypeReference<Avatars>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Load avatar
     * Loads a custom avatar for a project or issue type.  Specify the avatar&#x27;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#x27;X-Atlassian-Token: no-check&#x27; &#x60;  &#x60;--header &#x27;Content-Type: image/&lt; image_type&gt;&#x27; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#x27;https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}&#x27;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#x27;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#x27;s displayed avatar.  *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#x27;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>201</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if:   *  an image isn&#x27;t included in the request.  *  the image type is unsupported.  *  the crop parameters extend the crop area beyond the edge of the image.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permissions.
     * <p><b>404</b> - Returned if the avatar type is invalid, the associated item ID is missing, or the item is not found.
     * @param body The body parameter
     * @param size The length of each side of the crop region.
     * @param type The avatar type.
     * @param entityId The ID of the item the avatar is associated with.
     * @param x The X coordinate of the top-left corner of the crop region.
     * @param y The Y coordinate of the top-left corner of the crop region.
     * @return Avatar
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Avatar storeAvatar(Object body, Integer size, String type, String entityId, Integer x, Integer y) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling storeAvatar");
        }
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'size' when calling storeAvatar");
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling storeAvatar");
        }
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityId' when calling storeAvatar");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("type", type);
        uriVariables.put("entityId", entityId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/universal_avatar/type/{type}/owner/{entityId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "x", x));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "y", y));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "*/*"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Avatar> returnType = new ParameterizedTypeReference<Avatar>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
