package edu.eci.arsw.portal;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Portal2dMain extends ApplicationAdapter {
	SpriteBatch batch;
	private OrthographicCamera camera;
	private king king;
	
	@Override
	public void create () {
		this.batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false,800,400);
		camera.update();
		this.king = new king(10,10);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1,1,1,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		this.camera.update();
		this.batch.setProjectionMatrix(camera.combined);

		this.batch.begin();
		this.king.render(batch);
		this.king.setX(this.king.getX()+1);
		this.batch.end();
	}
}
